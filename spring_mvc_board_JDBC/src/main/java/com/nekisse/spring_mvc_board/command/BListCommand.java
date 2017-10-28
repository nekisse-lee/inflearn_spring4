package com.nekisse.spring_mvc_board.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.nekisse.spring_mvc_board.dao.BDao;
import com.nekisse.spring_mvc_board.dto.BDto;

public class BListCommand implements BCommand {

	@Override
	public void execute(Model model) {
		
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
		
		model.addAttribute("list", dtos);
		
	}

}
