package com.hackathon.hackalhot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateBarangRequest {

  private String name;

  private String category;

  private Integer quantity;

  private String description;

  private String pictureUrl;

  private Boolean isTersalurkan;
}
