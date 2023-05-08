package com.example.commetToon.api.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.core.env.Environment;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;

@Slf4j
@Component
@RequiredArgsConstructor
public class UserService {

    @Autowired
    ApplicationContext context;


    public void login(String authCode){

        // oauth properties client id 받아오기
        Environment env = context.getEnvironment();
        String clientId = env.getProperty("spring.security.oauth2.client.registration.google.client-id");


        // from google

        GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(new NetHttpTransport(), new GsonFactory())

                // Specify the CLIENT_ID of the app that accesses the backend:
                .setAudience(Collections.singletonList(clientId))    //oauth 클라이언트 id
                // Or, if multiple clients access the backend:
                //.setAudience(Arrays.asList(CLIENT_ID_1, CLIENT_ID_2, CLIENT_ID_3))
                .build();

        // (Receive idTokenString by HTTPS POST)

        GoogleIdToken idToken = verifier.verify(authCode);

    }
}
