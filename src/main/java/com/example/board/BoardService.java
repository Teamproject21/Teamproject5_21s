package com.example.board;

import java.util.List;

public interface BoardService {
    public int insertBoard(BoardVO vo);
    public int deleteBoard(int num);
    public int updateBoard(BoardVO vo);
    public BoardVO getBoard(int num);
    public List<BoardVO> getBoardList();


}
