package com.jigwon;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jigwon.models.Board;
import com.jigwon.repositories.BoardRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootApplicationTests {

	@Autowired
	BoardRepository boardRepository;
	
	@Test
	public void testInsert200() {
		for(int i=1; i<=200; i++) {
			Board board =new Board();
			board.setTitle("제목.."+i);
			board.setContent("내용.."+i);
			board.setWriter("user0"+(i%10));
			boardRepository.save(board);
		}
	}
	@Test
	public void contextLoads() {
	}

}
