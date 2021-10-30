package com.example.bigid.enums;

public enum EmotionEnum {

    NAUTRAL(0),POSITIVE(1),NEGATIVE(2);

    EmotionEnum(int i) {

    }

    public static EmotionEnum getStringValue(int randomNum) throws Exception {
        switch (randomNum) {
            case 0: return EmotionEnum.NAUTRAL;
            case 1: return EmotionEnum.POSITIVE;
            case 2: return EmotionEnum.NEGATIVE;
            default : throw new Exception(" WRONG EMOTION VALUE !!! ");
        }

    }

}
