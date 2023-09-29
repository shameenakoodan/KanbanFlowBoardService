package org.shameenakoodan.KanbanFlowBoardService.repository;

import org.shameenakoodan.KanbanFlowBoardService.model.Boards;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardsRepository extends JpaRepository<Boards,Long> {
  //  List<Boards> findAllBoards();
    Boards findBoardsById(Long id);
}
