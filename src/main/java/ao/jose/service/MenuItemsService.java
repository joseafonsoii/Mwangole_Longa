package ao.jose.service;

import ao.jose.entity.MenuItem;
import ao.jose.repository.MenuItemRepository;
import org.springframework.stereotype.Service;

@Service
public class MenuItemsService {


    private final MenuItemRepository repository;

    public MenuItemsService(MenuItemRepository repository) {
        this.repository = repository;
    }

    public void saveItemsOnMenu(MenuItem item){
        repository.saveAndFlush(item);
    }
}
