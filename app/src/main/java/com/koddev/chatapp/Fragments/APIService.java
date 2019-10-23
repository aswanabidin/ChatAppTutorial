package com.koddev.chatapp.Fragments;

import com.koddev.chatapp.Notifications.MyResponse;
import com.koddev.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAU066V_c:APA91bG9DTFM8CUIg5v3BxS-vVDFDDLL6o-3_inZZsMHU9uvQHAbBxutv4QrPsoBZSbuSWqPRa1eG0F7CfPnDhJRbLnltmivsOkJ_A3IPIi01VxBc8ANstaBUzu7IatwNQqvxcX-mS_A"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
