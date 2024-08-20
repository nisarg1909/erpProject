package com.SpringBootJPA.erpProject.BOM;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BOMController {
    @Autowired
    public BOMService bomService;

    @RequestMapping("/bom")
    public List<BOM> getBOM(){
        return bomService.getBOM();
    }

    @RequestMapping("/bom/{id}")
    public BOM getBOMById(@PathVariable("id") int id){
        return bomService.getBOMById(id);
    }

    @RequestMapping("/bom/name/{name}")
    public List<BOM> getBOMById(@PathVariable("name") String name){
        return bomService.getBOMbyName(name);
    }

    @PostMapping("/bom")
    public String addBOM(@RequestBody BOM bom){
        bomService.addBOM(bom);
        return "BOM added successfully";
    }

    @PutMapping("/bom")
    public String updateBOM(@RequestBody BOM bom){
        bomService.updateBOM(bom);
        return "BOM updated successfully";
    }

    @DeleteMapping("/bom")
    public String deleteBOM(@RequestBody BOM bom){
        bomService.deleteBOM(bom);
        return "BOM deleted successfully";
    }

}
