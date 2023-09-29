package org.shameenakoodan.KanbanFlowBoardService.impl;

import org.shameenakoodan.KanbanFlowBoardService.dto.BoardDTO;
import org.shameenakoodan.KanbanFlowBoardService.model.Boards;
import org.shameenakoodan.KanbanFlowBoardService.repository.BoardsRepository;
import org.shameenakoodan.KanbanFlowBoardService.service.BoardsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BoardServiceImpl implements BoardsService {

    private BoardsRepository boardsRepository;

    public BoardServiceImpl(BoardsRepository boardsRepository) {
        this.boardsRepository = boardsRepository;
    }

    @Override
    public void saveBoard(BoardDTO boardDTO) {
        Boards boards = new Boards();
        boards.setBoardname(boardDTO.getBoardname());
        boards.setDescription(boardDTO.getDescription());
        boardsRepository.save(boards);
    }

    @Override
    public Boards findBoardsById(Long id) {
        return boardsRepository.findBoardsById(id);
    }

    @Override
    public List<BoardDTO> findAllBoards() {
        List<Boards> boards = boardsRepository.findAll();

        return boards.stream().map((board)->mapToBoard(board)).collect(Collectors.toList());
    }
    private BoardDTO mapToBoard(Boards boards){
        BoardDTO boardDTO = new BoardDTO();
        boardDTO.setBoardname(boards.getBoardname());
        boardDTO.setDescription(boards.getDescription());
        return boardDTO;
    }
}
