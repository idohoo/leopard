package io.leopard.web4j.permission;


public interface PermissionDao extends IGet<Permission, PermissionKey> {

	@Override
	boolean add(Permission permission);

	@Override
	Permission get(PermissionKey permissionKey);

}
