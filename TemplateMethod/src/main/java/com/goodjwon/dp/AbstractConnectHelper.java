package com.goodjwon.dp;

public abstract class AbstractConnectHelper {

    protected abstract String doSecurity(String string);

    protected abstract boolean authentication(String id, String password);

    protected abstract int authorization(String userName);

    protected abstract String connection(String info);

    public String requestConnection(String encodeInfo){

        //보안작업 => 암호화된 문자열을 복호화 한다.
        String decodeInfo = doSecurity(encodeInfo);

        String info[] = decodeInfo.split("\\|");

        String id = info[0];
        String password = info[1];

        if(!authentication(id, password)){
            throw new Error("암호 불일치 오류 발생");
        }

        int i = authorization(id);

        switch (i) {
            case -1 :
                throw new Error("셧다운에 걸렸습니다.");
            case 0:
                System.out.println("당신은 Manager 입니다.");
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }

        return connection(decodeInfo);
    }
}
