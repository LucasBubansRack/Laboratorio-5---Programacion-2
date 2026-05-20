package org.example;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Vino vino = new Vino();

        vino.setIdProducto(1);
        vino.setNombre("Vino Malbec");
        vino.setPrecio(3500);
        vino.setValorCosto(2000);
        vino.setStock(10);
        vino.setGraduacionAlcoholica(13.5);
        vino.setTipoVino("Malbec");

        Cerveza cerveza = new Cerveza();

        cerveza.setIdProducto(2);
        cerveza.setNombre("Cerveza IPA");
        cerveza.setPrecio(2500);
        cerveza.setValorCosto(1200);
        cerveza.setStock(20);
        cerveza.setGraduacionAlcoholica(5.2);
        cerveza.setTipoCerveza("IPA");

        System.out.println("===== PRODUCTOS =====");

        DetallePedido detalle1 = new DetallePedido(2, vino);

        DetallePedido detalle2 = new DetallePedido(3, cerveza);

        Pedido pedido = new Pedido();

        pedido.setIdPedido(100);

        pedido.setFecha(new Date());

        pedido.agregarDetalle(detalle1);
        pedido.agregarDetalle(detalle2);

        System.out.println("Stock restante vino: " + vino.getStock());
        System.out.println("Stock restante cerveza: " + cerveza.getStock());

        pedido.calcularTotal();

        System.out.println("===== RESUMEN DEL PEDIDO =====");

        System.out.println(pedido);
        pedido.mostrarDetalles();

        vino.mostrarMaridaje();
        cerveza.servirFria();

        System.out.println(vino);
        System.out.println(cerveza);

        System.out.println("Total: $" + pedido.getTotal());

        pedido.confirmarPedido();
        System.out.println("Estado actual: " + pedido.getEstado());

        System.out.println("===== PAGO =====");
        MercadoPago pago = new MercadoPago();

        pago.setAliasCuenta("noelia.mp");
        pago.setMonto(pedido.getTotal());
        pago.setFechaPago(new Date());

        if (pago.procesarPago()) {
            System.out.println("Pago procesado correctamente");
            System.out.println("Monto pagado: $" + pago.getMonto());
            pago.emitirComprobante();
        } else {
            System.out.println("Error al procesar pago");
        }
        System.out.println("==============================");
    }
}