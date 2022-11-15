package com.bitacademy.guestbook.controller;

import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitacademy.guestbook.repository.GuestbookRepository;
import com.bitacademy.guestbook.vo.GuestbookVo;

@Controller
public class GuestbookController {
	@Autowired 	// DI 요청(Root Application container & Web Application container)
	private GuestbookRepository guestbookRepository;
	
	@RequestMapping("")
	public String index(Model model) {
		List<GuestbookVo> list = guestbookRepository.findAll();
		model.addAttribute("list", list);
		return "/WEB-INF/views/index.jsp";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String delete(Long no, String password) {
		guestbookRepository.deleteByNoAndPassword(no, password);
		return "redirect:/";
	}
	
	@RequestMapping(value="/deleteform", method=RequestMethod.GET)
	public String delete() {
		return "/WEB-INF/views/deleteform.jsp";
	}
		
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(GuestbookVo vo) {
		guestbookRepository.insert(vo);
		return "redirect:/";		
	}
}
