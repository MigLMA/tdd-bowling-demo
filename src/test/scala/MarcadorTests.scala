package org.paradigma.tddbowlingdemo

import org.scalatest.FunSuite

class MarcadorTests extends FunSuite {

  test("puntuación del marcador sin lanzamientos") {
    val marcadorInicial = 0
    val marcadorSinLanzamiento = new Marcador

    assert(marcadorSinLanzamiento.getPuntuacion() == marcadorInicial, s"El marcador inicial no es $marcadorInicial")
  }

  test("puntuación del marcador con un lanzamiento") {
    val puntuacionDelLanzamiento = 5
    val marcadorConLanzamiento = new Marcador

    marcadorConLanzamiento.añadirLanzamiento(puntuacionDelLanzamiento)

    assert(marcadorConLanzamiento.getPuntuacion() == puntuacionDelLanzamiento, s"El marcador tras el lanzamiento no es $puntuacionDelLanzamiento")
  }
}

class Marcador {
  def getPuntuacion() = 0

  def añadirLanzamiento(lanzamiento: Lanzamiento) {

  }
}





