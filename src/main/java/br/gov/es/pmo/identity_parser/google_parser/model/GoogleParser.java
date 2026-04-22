/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.es.pmo.identity_parser.google_parser.model;

import br.gov.es.pmo.identity_parser.pmo_base.model.IIdentityParser;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Component;

/**
 *
 * @author gean.carneiro
 */
@Component("idsvr")
public class GoogleParser implements IIdentityParser<String>{

    private final String SUB = "sub";
    private final String NOME = "name";
    private final String EMAIL = "email";
    
    @Override
    public String getId(OAuth2User user, String accessToken, String clientToken) {
        return (String) user.getAttribute(SUB);
    }

    @Override
    public String getNome(OAuth2User user, String accessToken, String clientToken) {
        return (String) user.getAttribute(NOME);
    }

    @Override
    public String getEmail(OAuth2User user, String accessToken, String clientToken) {
        return (String) user.getAttribute(EMAIL);
    }
    
}
