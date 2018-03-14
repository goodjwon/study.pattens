package com.goodjwon.dp;

public class DefaultGameConnecHelper extends AbstractConnectHelper {

    @Override
    protected String doSecurity(String string) {
        System.out.println("복호화를 진행 합니다. - 했다치고..");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("암호를 확인 합니다. id => id, password => password 만 허용 합니다." );
        System.out.println("id => "+id);
        System.out.println("password => "+ password);

        boolean result = false;

        if(id.equals("id") && password.equals("password")) result = true;
        if(id.equals("child") && password.equals("password")) result = true;

        return result;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("레벨을 확인 합니다. Check Level");
        //성인이 아니고 10시가 지났다면 권한이 없다.
        //여기선 id라는 사용자만 허용 가능 한 것으로 한다.
        if(userName.equals("child")) return -1;

        return 0;
    }

    @Override
    protected String connection(String info) {
        return null;
    }
}
