package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.entities.Player;
import com.example.repositories.PlayersRepository;

@Controller
public class PlayerController {
	
	@Autowired
	PlayersRepository repository;
	
	@RequestMapping("/newplayer")
	public String getNewPlayer(Model model) {
		Player player = new Player();
		model.addAttribute("newPlayer", player);

		return "newplayerform";
	}

	@RequestMapping(value = "/addplayer", method = RequestMethod.POST)
	public String save(@ModelAttribute("newPlayer") Player player, BindingResult result, Model model) {
		repository.save(player);
		return "";
	}
	@ResponseBody
	@RequestMapping("/showplayers")
	public Iterable<Player> listPlayers() {
		return repository.findAll();
	}
}
