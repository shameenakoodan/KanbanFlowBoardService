package org.shameenakoodan.KanbanFlowBoardService.service;

import org.shameenakoodan.KanbanFlowBoardService.dto.BoardDTO;
import org.shameenakoodan.KanbanFlowBoardService.model.Boards;

import java.util.List;

public interface BoardsService {
    void saveBoard(BoardDTO boardDTO);
    Boards findBoardsById(Long id);
    List<BoardDTO> findAllBoards();
}
