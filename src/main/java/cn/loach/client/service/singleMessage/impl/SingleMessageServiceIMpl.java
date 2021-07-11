package cn.loach.client.service.singleMessage.impl;

import cn.loach.client.enums.MessageContentTypeEnum;
import cn.loach.client.message.request.SingleChatRequestMessage;
import cn.loach.client.service.singleMessage.SingleMessageService;

import java.util.UUID;

public class SingleMessageServiceIMpl implements SingleMessageService {

    private static volatile SingleMessageServiceIMpl singleMessageServiceIMpl;

    public static SingleMessageServiceIMpl getInstance() {
        if (null == singleMessageServiceIMpl) {
            singleMessageServiceIMpl = new SingleMessageServiceIMpl();
            synchronized (SingleMessageServiceIMpl.class) {
                if (null == singleMessageServiceIMpl) {
                    singleMessageServiceIMpl = new SingleMessageServiceIMpl();
                }
            }
        }
        return singleMessageServiceIMpl;
    }

    @Override
    public SingleChatRequestMessage getSendMessageModel(String message) {
        SingleChatRequestMessage singleChatMessage = new SingleChatRequestMessage();
        singleChatMessage.setContent(message);

        return singleChatMessage;
    }
}
