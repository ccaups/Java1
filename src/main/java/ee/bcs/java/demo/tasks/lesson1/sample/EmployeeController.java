package ee.bcs.java.demo.tasks.lesson1.sample;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {
    static List<EmployeeDto> list = new ArrayList<>();

    @GetMapping("/Employee")
    public static List<EmployeeDto> getList() {
        return list;
    }

    @GetMapping("/Employee/{id}")
    public EmployeeDto getEmployeeById(@PathVariable int id) {
        return list.get(id);
    }
    @PutMapping("/Employee/{id}")
    public EmployeeDto putEmployeeById(@PathVariable int id,@RequestBody EmployeeDto Employee) {
        EmployeeDto detail = list.get(id);
        detail.setFirstName(Employee.getFirstName());
        detail.setLastName(Employee.getLastName());
        detail.setId(Employee.getId());
        detail.setAge(Employee.getAge());
        detail.setAddress(Employee.getAddress());
        return list.set(id,detail);
    }

    @PostMapping("/Employee")
    public boolean postEmployee(@RequestBody EmployeeDto Employee) {
        Employee.setId(list.size());
        return list.add(Employee);
    }

    @DeleteMapping("/Employee/{id}")
    public EmployeeDto RemoveEmployeeById(@PathVariable int id) {
        return list.remove(id);
    }
}