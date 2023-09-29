package org.shameenakoodan.KanbanFlowBoardService.dto;

public class BoardDTO {
    private  Long id;
    String boardname;
    String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBoardname() {
        return boardname;
    }

    public void setBoardname(String boardname) {
        this.boardname = boardname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
