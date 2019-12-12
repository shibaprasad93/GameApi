package com.game.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.api.model.Games;
import com.game.api.repository.GamesRepo;

@Service
public class GamesService {
	@Autowired
	private GamesRepo gamesRepo;

	public List<Games> searchByTitle(String title) {
		return gamesRepo.findByTitle(title);
	}

	public Games addGames(Games games) {
		return gamesRepo.save(games);
	}

	public Games updateGames(Games games) {
		return gamesRepo.save(games);
	}

	public void deleteGames(Long id) {
		gamesRepo.deleteById(id);
	}



}
