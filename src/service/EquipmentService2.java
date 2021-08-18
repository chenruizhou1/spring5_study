package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author chenruizhou
 * @date 2021/8/18
 * spring事务测试用service
 */
@Service
@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
public class EquipmentService2 {

    private final JdbcTemplate jdbcTemplate;
    private final EquipmentService equipmentService;
    @Autowired
    public EquipmentService2(JdbcTemplate jdbcTemplate, EquipmentService equipmentService) {
        this.jdbcTemplate = jdbcTemplate;
        this.equipmentService = equipmentService;
    }

    public void updateEquipment1() {
        String sql = "update t_equipment t set t.LEVEL=? where t.ID=?";
        jdbcTemplate.update(sql, "T0", "2");
        equipmentService.updateEquipment2();
        int a = 1 / 0;
    }

}
