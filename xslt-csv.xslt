<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:gpx="http://www.topografix.com/GPX/1/1">
    <xsl:output method="text" encoding="UTF-8" />
    
    <xsl:template match="/">
        <xsl:text>Latitud;Longitud;Elevación;Tiempo;Nombre</xsl:text>
        <xsl:text>&#10;</xsl:text>
        
        <!-- Procesar waypoints -->
        <xsl:for-each select="//gpx:wpt">
            <xsl:value-of select="@lat"/>
            <xsl:text>;</xsl:text>
            <xsl:value-of select="@lon"/>
            <xsl:text>;</xsl:text>
            <xsl:value-of select="gpx:ele"/>
            <xsl:text>;</xsl:text>
            <xsl:value-of select="gpx:time"/>
            <xsl:text>;</xsl:text>
            <xsl:value-of select="gpx:name"/>
            <xsl:text>&#10;</xsl:text>
        </xsl:for-each>
        
        <!-- Procesar track points -->
        <xsl:for-each select="//gpx:trkpt">
            <xsl:value-of select="@lat"/>
            <xsl:text>;</xsl:text>
            <xsl:value-of select="@lon"/>
            <xsl:text>;</xsl:text>
            <xsl:value-of select="gpx:ele"/>
            <xsl:text>;</xsl:text>
            <xsl:value-of select="gpx:time"/>
            <xsl:text>&#10;</xsl:text>
        </xsl:for-each>
    </xsl:template>
</xsl:stylesheet>
