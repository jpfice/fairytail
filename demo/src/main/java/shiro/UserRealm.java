package shiro;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

import shiro.dao.UserDao;


@Component
public class UserRealm extends AuthorizingRealm{

//    @Resource
//    private UserServiceImpl userService;


    @Resource
    private UserDao userDao;

    public UserRealm() {
        setName("UserRealm");
    }

    /**
     * 权限认证
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
//        String username = (String) principals.getPrimaryPrincipal();
//        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
//        authorizationInfo.setRoles(userService.findRoles(username));
//        authorizationInfo.setStringPermissions(userService.findPermissions(username));
//        return authorizationInfo;


        Long userId = (Long) principals.fromRealm(getName()).iterator().next();

//        User user = userService.get(userId);
//
//        if (user != null) {
//
//          SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//
//          for (SysRole role : user.getRoles()) {
//
//            info.addRole(role.getRoleKey());
//
//            info.addStringPermissions(role.getPermissions());
//
//          }
//
//          return info;
//
//        } else {
//
//          return null;
//
//        }
        return null;
    }

    /**
     * 登录认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
//        String username = (String)token.getPrincipal();
//        User user = userService.findByUsername(username);
//        if(user == null) {
//            throw new UnknownAccountException();//没找到帐号
//        }
//        if(Boolean.TRUE.equals(user.getLocked())) {
//            throw new LockedAccountException(); //帐号锁定
//        }
//        //交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以在此判断或自定义实现
//        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
//                user.getUsername(), //用户名
//                user.getPassword(), //密码
//                ByteSource.Util.bytes(user.getCredentialsSalt()),//salt=username+salt
//                getName()  //realm name
//        );
        return null;
        //return authenticationInfo;
    }

}
