package org.sondev.nftmarketplacebe.mapper;

import org.mapstruct.Mapper;
import org.sondev.nftmarketplacebe.dto.request.RegisterRequest;
import org.sondev.nftmarketplacebe.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper{
    User toUser(RegisterRequest registerRequest);


}
