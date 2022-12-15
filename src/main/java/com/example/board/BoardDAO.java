package com.example.board;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDAO {

    @Autowired
    SqlSession sqlSession;

    public int insertBoard(BoardVO vo){
        int result = sqlSession.insert("Board.insertBoard",vo);
        return result;
    }

    public BoardVO getBoard (int num) {
        BoardVO one = sqlSession.selectOne("Board.getBoard",num);
        return one;
    }

    public List<BoardVO> getBoardList(){
        List<BoardVO> list = sqlSession.selectList("Board.getBoardList");
        return list;
    }

    public int deleteBoard(int num){
        int result = sqlSession.delete("Board.deleteBoard",num);
        return result;
    }

    public int updateBoard(BoardVO vo){
        int result = sqlSession.update("Board.updateBoard",vo);
        return result;

    }
}
