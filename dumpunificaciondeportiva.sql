-- MariaDB dump 10.18  Distrib 10.5.8-MariaDB, for Linux (x86_64)
--
-- Host: localhost    Database: futbolisoo
-- ------------------------------------------------------
-- Server version	10.5.8-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `futbolisoo`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `futbolisoo` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `futbolisoo`;

--
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categoria` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_categoria` varchar(45) COLLATE utf8_bin NOT NULL,
  `lunes` tinyint(1) NOT NULL DEFAULT 0,
  `martes` tinyint(1) NOT NULL DEFAULT 0,
  `miercoles` tinyint(1) NOT NULL DEFAULT 0,
  `jueves` tinyint(1) NOT NULL DEFAULT 0,
  `viernes` tinyint(1) NOT NULL DEFAULT 0,
  `sabado` tinyint(1) NOT NULL DEFAULT 0,
  `domingo` tinyint(1) NOT NULL DEFAULT 0,
  `duracion_partidos` int(11) DEFAULT NULL,
  `estatus` tinyint(1) DEFAULT NULL COMMENT '0->Deshabilitado 1->Activo',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,'Varonil',1,0,1,0,1,0,1,90,1),(2,'Femenil',0,1,1,0,0,1,0,90,1),(3,'Juvenil',0,1,0,1,0,1,1,60,1),(17,'Sub-17',0,0,1,0,1,1,0,90,1);
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equipo`
--

DROP TABLE IF EXISTS `equipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `equipo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_categoria` int(11) DEFAULT NULL,
  `nombre_equipo` varchar(45) COLLATE utf8_bin NOT NULL,
  `color_playera` varchar(45) COLLATE utf8_bin NOT NULL,
  `color_short` varchar(45) COLLATE utf8_bin NOT NULL,
  `logo` longtext COLLATE utf8_bin DEFAULT NULL,
  `grupo` int(11) NOT NULL,
  `estatus` tinyint(1) DEFAULT NULL,
  `archivo_registros` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=172 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipo`
--

LOCK TABLES `equipo` WRITE;
/*!40000 ALTER TABLE `equipo` DISABLE KEYS */;
INSERT INTO `equipo` VALUES (160,1,'Pumas','blanco','azul','Goyo',1,1,'Archivos.pdf'),(161,1,'America','amarillo','amarillo','Aguila',3,1,'Archivos.pdf'),(162,1,'Chivas','rojo','blanco','Chivo',1,1,'Archivos.pdf'),(163,2,'Pumas Fem','rosa','blanco','Goyo',4,1,'Archivos.pdf'),(164,2,'Tortugas','verde','naranja','Tortuga',2,3,'Archivos.pdf'),(165,2,'Abejas','amarillo','negro','Abeja',2,3,'Archivos.pdf'),(166,3,'Cruz Azul','azul','blanco','Cruz',1,3,'Archivos.pdf'),(167,3,'Leon','verde','blanco','Leon',4,2,'Archivos.pdf'),(168,3,'Tigres','naranja','azul','Tigre',1,2,'Archivos.pdf'),(169,17,'Cuervos F.C.','rojo','negro','Cuervo',1,2,'Archivos.pdf'),(170,17,'Tiburones','azul','blanco','Tiburon',3,1,'Archivos.pdf'),(171,17,'Mineros','amarillo','gris','Mina',1,4,'Archivos.pdf');
/*!40000 ALTER TABLE `equipo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equipo_torneo`
--

DROP TABLE IF EXISTS `equipo_torneo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `equipo_torneo` (
  `id_equipo` int(10) unsigned NOT NULL,
  `id_torneo` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id_equipo`,`id_torneo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipo_torneo`
--

LOCK TABLES `equipo_torneo` WRITE;
/*!40000 ALTER TABLE `equipo_torneo` DISABLE KEYS */;
INSERT INTO `equipo_torneo` VALUES (160,98),(161,98),(161,99),(162,98),(162,99);
/*!40000 ALTER TABLE `equipo_torneo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `partido`
--

DROP TABLE IF EXISTS `partido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `partido` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_torneo` int(11) NOT NULL,
  `id_equipo_local` int(11) NOT NULL,
  `id_equipo_visita` int(11) NOT NULL,
  `horario_partido` timestamp NOT NULL DEFAULT current_timestamp(),
  `goles_local` tinyint(2) DEFAULT 0,
  `goles_visita` tinyint(2) DEFAULT 0,
  `jornada` int(11) NOT NULL,
  `estado` varchar(45) COLLATE utf8_bin DEFAULT NULL COMMENT 'suspendido "SUS"\\njugado "JUG"\\npendiente "PEN"',
  `estatus` tinyint(1) unsigned NOT NULL DEFAULT 1,
  PRIMARY KEY (`id`),
  KEY `id_partido_torneo_fk_idx` (`id_torneo`),
  KEY `id_partido_equipo_1_fk_idx` (`id_equipo_local`),
  KEY `id_partido_equipo_visitante_fk_idx` (`id_equipo_visita`),
  CONSTRAINT `id_partido_equipo_local_fk` FOREIGN KEY (`id_equipo_local`) REFERENCES `equipo` (`id`),
  CONSTRAINT `id_partido_equipo_visita_fk` FOREIGN KEY (`id_equipo_visita`) REFERENCES `equipo` (`id`),
  CONSTRAINT `id_partido_torneo_fk` FOREIGN KEY (`id_torneo`) REFERENCES `torneo` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=958 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `partido`
--

LOCK TABLES `partido` WRITE;
/*!40000 ALTER TABLE `partido` DISABLE KEYS */;
INSERT INTO `partido` VALUES (957,98,160,161,'2020-12-07 22:24:14',0,0,1,NULL,1);
/*!40000 ALTER TABLE `partido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `torneo`
--

DROP TABLE IF EXISTS `torneo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `torneo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_categoria` int(11) NOT NULL,
  `nombre_torneo` varchar(45) COLLATE utf8_bin NOT NULL,
  `fecha_inicio` date NOT NULL,
  `estatus` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_categoria_idx` (`id_categoria`),
  CONSTRAINT `id_categoria_torneo_fk` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=106 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `torneo`
--

LOCK TABLES `torneo` WRITE;
/*!40000 ALTER TABLE `torneo` DISABLE KEYS */;
INSERT INTO `torneo` VALUES (98,1,'Liga MX','2020-12-11',1),(99,1,'Copa MX','2020-10-02',3),(100,2,'Copa Fem MX','2020-03-21',1),(101,2,'Liga MX','2020-08-19',3),(102,3,'Liga Junior MX','2023-01-11',2),(103,3,'Copa Junior MX','2012-06-19',1),(104,17,'Copa Sub17 MX','2019-03-04',1),(105,17,'Liga Sub 17 MX','2020-07-07',2);
/*!40000 ALTER TABLE `torneo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `tipo_usuario` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-15 23:14:48
