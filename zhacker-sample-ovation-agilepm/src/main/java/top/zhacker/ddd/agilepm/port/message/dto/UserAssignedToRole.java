package top.zhacker.ddd.agilepm.port.message.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import top.zhacker.core.model.BaseDomainEvent;
import top.zhacker.ddd.agilepm.domain.tenant.TenantId;


/**
 * Created by zhacker.
 * Time 2018/6/30 下午5:37
 */
@Getter
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class UserAssignedToRole extends BaseDomainEvent {
  private TenantId tenantId;
  private String roleName;
  private String username;
  private String firstName;
  private String lastName;
  private String emailAddress;
}
