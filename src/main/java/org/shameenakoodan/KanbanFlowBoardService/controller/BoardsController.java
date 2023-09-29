package org.shameenakoodan.KanbanFlowBoardService.controller;

import jakarta.validation.Valid;
import org.shameenakoodan.KanbanFlowBoardService.dto.BoardDTO;
import org.shameenakoodan.KanbanFlowBoardService.model.Boards;
import org.shameenakoodan.KanbanFlowBoardService.service.BoardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class BoardsController {
    private BoardsService boardsService;

    @Autowired
    public BoardsController(BoardsService boardsService) {
        this.boardsService = boardsService;
    }
    @PostMapping("/create-board")
    public void addNewBoard(@RequestBody BoardDTO boardDTO) {
        boardsService.saveBoard(boardDTO);
    }

    @GetMapping("/all-boards")
    public List<BoardDTO> getAllBoards(){
        return boardsService.findAllBoards();
    }
}