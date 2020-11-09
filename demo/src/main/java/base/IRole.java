package base;

import javax.management.relation.Role;

/*
 *
 * 相对于 PermissionService 多了关联 / 移除关联角色 - 权限功能。
 */
public interface IRole {

    public Role createRole(Role role);
    public void deleteRole(Long roleId);
    //添加角色-权限之间关系
    public void correlationPermissions(Long roleId, Long... permissionIds);
    //移除角色-权限之间关系
    public void uncorrelationPermissions(Long roleId, Long... permissionIds);
}
