package cn.xxblog.demo.listener;

import cn.xxblog.demo.common.MsgType;
import cn.xxblog.demo.common.MsgTypeEnum;
import lombok.extern.slf4j.Slf4j;

/**
 * @author devpan
 * description:
 */
@MsgType(msgType = MsgTypeEnum.ALL_MESSAGE)
@Slf4j
public class DefaultMsgListener implements MsgListener {

    @Override
    public void handleMessage(MsgTypeEnum msgType, String message) {
        log.info("default:" + message);
    }
}