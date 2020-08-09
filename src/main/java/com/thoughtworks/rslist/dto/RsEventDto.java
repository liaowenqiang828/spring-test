package com.thoughtworks.rslist.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rsEvent")
public class RsEventDto {
  @Id @GeneratedValue private int id;
  private String eventName;
  private String keyWord;
  private int voteNum;
  @ManyToOne private UserDto user;

  @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "trade")
  private List<TradeDto> tradeDtos;
}
