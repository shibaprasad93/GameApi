package com.game.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.game.api.model.Games;
@Repository
public interface GamesRepo extends JpaRepository<Games, Long>{
    @Query(value = "SELECT * FROM games WHERE title=?1",nativeQuery=true)
	List<Games> findByTitle(String title);

}
