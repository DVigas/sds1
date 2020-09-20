package com.dvigas.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dvigas.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
