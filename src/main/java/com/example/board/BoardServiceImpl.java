package com.example.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    BoardDAO boardDAO;

    @Override
    public int insertBoard(BoardVO vo) {
        return boardDAO.insertBoard(vo);
    }

    @Override
    public int deleteBoard(int num) {
        return boardDAO.deleteBoard(num);
    }

    @Override
    public int updateBoard(BoardVO vo) {return boardDAO.updateBoard(vo);}

    @Override
    public BoardVO getBoard(int num) {
        return boardDAO.getBoard(num);
    }

    @Override
    public List<BoardVO> getBoardList() {
        return boardDAO.getBoardList();
    }
}