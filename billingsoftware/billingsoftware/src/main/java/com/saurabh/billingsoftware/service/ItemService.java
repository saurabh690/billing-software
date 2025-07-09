package com.saurabh.billingsoftware.service;

import com.saurabh.billingsoftware.io.ItemRequest;
import com.saurabh.billingsoftware.io.ItemResponse;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ItemService {

    ItemResponse add(ItemRequest request, MultipartFile file) throws IOException;
    List<ItemResponse> fetchItems();
    void deleteItem(String itemId);
}
