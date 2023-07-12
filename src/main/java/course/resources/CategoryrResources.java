package course.resources;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import course.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryrResources {
    
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list); 
	
	}
	@GetMapping(value = "/{id")
	public ResponseEntity<Category> findById(@PathVariable Long Id) {
		Category obj = service.findById(Id);
		return ResponseEntity.ok().body(obj);
	}
}
