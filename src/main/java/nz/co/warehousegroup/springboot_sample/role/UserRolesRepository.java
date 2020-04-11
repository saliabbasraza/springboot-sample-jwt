package nz.co.warehousegroup.springboot_sample.role;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRolesRepository extends PagingAndSortingRepository<UserRole, Long> {

}
