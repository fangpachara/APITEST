package com.example.apitest.service;

import com.example.apitest.dto.SsoResponse;
import com.example.apitest.dto.SsoUserModel;
import com.example.apitest.entity.SsoUserEntity;
import com.example.apitest.repository.SsoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Map;

@Service
public class SsoService {

    @Autowired
    private SsoRepository ssoRepository;

    public SsoResponse saveData(SsoUserModel model) {
        SsoUserEntity user = new SsoUserEntity();
        try{
            user.setRequestDate(LocalDateTime.now());
            user.setSsoType(model.getSsoType());
            user.setSystemId(model.getSystemId());
            user.setSystemName(model.getSystemName());
            user.setSystemTransactions(model.getSystemTransactions());
            user.setSystemPrivileges(model.getSystemPrivileges());
            user.setSystemUserGroup(model.getSystemUserGroup());
            user.setSystemLocationGroup(model.getSystemLocationGroup());
            user.setUserId(model.getUserId());
            user.setUserFullName(model.getUserFullName());
            user.setUserRdOfficeCode(model.getUserRdOfficeCode());
            user.setUserOfficeCode(model.getUserOfficeCode());
            user.setClientLocation((model.getClientLocation()));
            user.setLocationMachineNumber((model.getLocationMachineNumber()));
            user.setTokenId(model.getTokenId());

            System.out.println("saving user");

            ssoRepository.save(user);
            //return new SsoResponse("I07000","ทำรายการเรียบร้อย", Map.of("userId", model.getUserId(),"tokenId", model.getTokenId()));
        }catch (Exception e){
            return null;
        }
        return null;
    }
}
