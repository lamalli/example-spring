package kr.co.songjava.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.songjava.mvc.domain.Board;
import kr.co.songjava.mvc.repository.BoardRepository;

@Service
public class BoardService {
	
	@Autowired
	private BoardRepository repository;
	
	public List <Board> getList() {
		
		return repository.getList();
		
	}
	
	public Board get(int boardSeq)  {
		
		return repository.get(boardSeq);
		
	}
	
	public void save(Board board)  {
		
		repository.save(board);
		
	}
	
	public void update(Board board)  {
		
		repository.update(board);
		
	}
	
	public void delete(int boardSeq)  {
		
		repository.delete(boardSeq);
		
	}
	
	

}
