package nz.co.warehousegroup.springboot_sample.role;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface RoleRepository extends PagingAndSortingRepository<Role, Long> {

    List<Role> findAllByNameIn(List<String> roleNames);
}
