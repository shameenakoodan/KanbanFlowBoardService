package org.shameenakoodan.KanbanFlowBoardService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@ToString
public class Boards {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String boardname;
    String description;

    public Boards(Long id, String boardname, String description) {
        this.id = id;
        this.boardname = boardname;
        this.description = description;
    }
}
