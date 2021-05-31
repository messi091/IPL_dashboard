package com.projects.IPL_dashboard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.projects.IPL_dashboard.data.MatchDataProcessor;
import com.projects.IPL_dashboard.model.Team;
import com.projects.IPL_dashboard.repository.TeamRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class TeamController {
	
	private static final Logger log = LoggerFactory.getLogger(TeamController.class);
	
	TeamRepository teamRepository;
	
	public TeamController(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
	}
	
	@GetMapping("/team/{teamName}")
	public Team getTeamDetails(@PathVariable String teamName) {
		return this.teamRepository.findByTeamName(teamName);
	}
}
