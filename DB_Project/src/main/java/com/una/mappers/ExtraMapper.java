package com.una.mappers;

import com.una.dto.ExtraDTO;
import com.una.models.Extra;

public interface ExtraMapper {
    public static ExtraDTO toDTO(Extra extra) {
        if (extra == null) return null;
        ExtraDTO dto = new ExtraDTO();
        dto.setId(extra.getId());
        dto.setName(extra.getName());
        dto.setDescription(extra.getDescription());
        dto.setPrice(extra.getPrice());
        return dto;
    }

    public static Extra toEntity(ExtraDTO dto) {
        Extra extra = new Extra();
        extra.setId(dto.getId());
        extra.setName(dto.getName());
        extra.setDescription(dto.getDescription());
        extra.setPrice(dto.getPrice());
        return extra;
    }
}
