package kr.co.songjava.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import kr.co.songjava.mvc.domain.Board;
import kr.co.songjava.mvc.repository.BoardRepository;
import kr.co.songjava.mvc.service.BoardService;

@RestController
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	
	@GetMapping
	public List <Board> getList() {
		
		return boardService.getList();
		
	}
	@GetMapping("/{boardSeq}")
	public Board get(@PathVariable int boardSeq)  {
		
		return boardService.get(boardSeq);
		
	}
	
	@GetMapping("/save")
	public void save(Board board)  {
		
		boardService.save(board);
		
	}

	@GetMapping("/delete/{boardSeq}")
	public void delete(@PathVariable int boardSeq)  {
		
		boardService.delete(boardSeq);
		
	}
	
	

}
