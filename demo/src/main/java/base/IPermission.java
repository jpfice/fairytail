package base;

import org.apache.shiro.authz.Permission;

/*
 * 实现基本的创建 / 删除权限。
 *
 */
public interface IPermission {
    public Permission createPermission(Permission permission);
    public void deletePermission(Long permissionId);
}
