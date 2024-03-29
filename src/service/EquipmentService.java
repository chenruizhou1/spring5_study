package service;

import model.Equipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author chenruizhou
 * @date 2021/8/17
 * 实现JdbcTemplate测试Service
 */
@Service
@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
public class EquipmentService {

    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public EquipmentService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addEquipment(Equipment equipment) {
        String sql = "INSERT INTO t_equipment (`ID`,`NAME`,`TYPE`,`LEVEL`) VALUES (?,?,?,?)";
        Object[] args = {equipment.getId(), equipment.getName(), equipment.getType(), equipment.getLevel()};
        jdbcTemplate.update(sql, args);
    }

    public void updateEquipment2() {
        String sql = "update t_equipment t set t.LEVEL=? where t.ID=?";
        jdbcTemplate.update(sql, "T0", "1");
        int a = 1 / 0;
    }

}
