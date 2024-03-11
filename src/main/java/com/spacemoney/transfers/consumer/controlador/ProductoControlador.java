package com.spacemoney.transfers.consumer.controlador;

import com.spacemoney.transfers.consumer.entity.TransferEntity;

import com.spacemoney.transfers.consumer.service.impl.TransferServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//http://localhost:8081/inventario-app
@RequestMapping("inventario-app")
@CrossOrigin(value= "http://localhost:4200")
public class ProductoControlador {

    private static final Logger logger =
            LoggerFactory.getLogger(ProductoControlador.class);

    //inyectamos para leer a la base de datos
    //para obtener todos los productos

    @Autowired
    private TransferServiceImpl transferService;

    //@Autowired
    //private ITransferService itransferService;

    //http://localhost:8081/inventario-app/productos
    @GetMapping("/productos")
    public List<TransferEntity> obtenerProductos() {
        List<TransferEntity> productos = this.transferService.listarProductos();

        logger.info("productos obtenidos:");
        productos.forEach((producto -> logger.info(producto.toString())));
        return productos;
    }


}
