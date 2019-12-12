package com.game.api;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.game.api.model.Games;
import com.game.api.repository.GamesRepo;

@SpringBootApplication
public class GameApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameApiApplication.class, args);
	}

}

@Component
class DumpData implements CommandLineRunner {
	@Autowired
	private GamesRepo gamerepo;

	@Override
	public void run(String... args) throws Exception {
		List<Games> gamesData = new ArrayList<Games>();
		File file = new File(
				getClass().getClassLoader().getResource("games.csv").getFile()
			);
		Reader in = new FileReader(file);
		Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(in);
		int i = 0;
		for (CSVRecord record : records) {
			gamesData.add(new Games(Long.parseLong(String.valueOf(i)), record.get(0), record.get(1),
					Double.parseDouble(record.get(2)), record.get(3), record.get(4)));
			i++;
		}

		gamerepo.saveAll(gamesData);
	}
}
