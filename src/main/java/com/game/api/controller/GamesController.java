package com.game.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.game.api.model.Games;
import com.game.api.service.GamesService;

@RestController
@RequestMapping("/api")
@CrossOrigin()
public class GamesController {
	
	@Autowired
	private GamesService gamesService;
	@GetMapping("/search/{title}")
	public List<Games> searchByTitle(@PathVariable("title") final String title){
		return gamesService.searchByTitle(title);
		
	}
	 @PostMapping("/insert")
	 public Games createGames(@RequestBody Games games) {
	        return gamesService.addGames(games);
	    }
	 @PutMapping("/update")
	 public Games updateGames(@RequestBody Games games) {
		return gamesService.updateGames(games); 
	 }
	 @DeleteMapping("/delete/{id}")
	 public void deleteGames(@PathVariable("id") Long id) {
		gamesService.deleteGames(id);
		 
	 }
	 

}
