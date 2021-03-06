package com.chauncy.datadev.pack;

/**
 * Created by chauncy on 2018/5/30.
 */
public enum MessageId {

    TERMINAL_RESPONSE(0x001), PLATFORM_RESPONSE(0x8001), TERMINAL_HEART(0x0002), TERMINAL_REGISTER(0x0100),
    TERMINAL_REGISTER_RESPONSE(0x8100), TERMINAL_CANCEL(0x0003), TERMINAL_AUTH(0x0102), TERMAINL_SET_PARAMETER(0X8103),
    TERMINAL_GET_PARAMETER(0x8104), TERMINAL_PARAMETER_RESPONSE(0x0104), CONTROL_TERMINAL(0X8105), LOCATION_REPORT(0x0200),LOCATION_REPORT_BATCH(0x0704);

    MessageId(int value) {
        this.value = value;
    }

    private int value;

    public int getValue() {
        return value;
    }


    public static MessageId getVal(int val) {
        for (MessageId messagId : values()) {
            if (messagId.getValue() == val) {
                return messagId;
            }
        }
        return null;
    }
}
