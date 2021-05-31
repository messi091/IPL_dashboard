package com.projects.IPL_dashboard.repository;

import org.springframework.data.repository.CrudRepository;

import com.projects.IPL_dashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long> {
	
	Team findByTeamName(String teamName);
}
