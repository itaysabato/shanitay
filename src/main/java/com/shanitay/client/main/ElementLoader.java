package com.shanitay.client.main;

import com.shanitay.client.utils.Utils;
import org.vectomatic.dom.svg.*;

/**
 * Created By: Itay Sabato<br/>
 * Date: 17/05/12 <br/>
 * Time: 20:04 <br/>
 */
class ElementLoader {
    private final OMSVGSVGElement svg;

    final OMSVGGElement slide;
    final OMSVGGElement watchRight1;
    final OMSVGGElement watchRight2;
    final OMSVGGElement watchRight3;
    final OMSVGGElement watchRight4;
    final OMSVGGElement watchRight5;
    final OMSVGGElement igulSlide;
    final OMSVGRectElement orangeCube;
    final OMSVGRectElement blueCube;
    final OMSVGRectElement blackCube;
    final OMSVGRectElement yellowMiddleCube;
    final OMSVGGElement house;
    final OMSVGGElement blueTriangle;
    final OMSVGGElement redLine;
    final OMSVGRectElement yellowLineDown;
    final OMSVGRectElement greenLineDown;
    final OMSVGRectElement pinkButton;
    final OMSVGRectElement redButton;
    final OMSVGGElement igulColor1;
    final OMSVGGElement igulColor2;
    final OMSVGGElement igulColor3;
    final OMSVGGElement igulColor4;
    final OMSVGRectElement pinkLine;
    final OMSVGGElement squareColor;
    final OMSVGGElement cube2;
    final OMSVGGElement upTriIgul;
    final OMSVGRectElement pinkCube;
    final OMSVGGElement coolIgul1;
    final OMSVGGElement coolIgul2;
    final OMSVGGElement coolIgul3;
    final OMSVGGElement coolIgul4;
    final OMSVGGElement coolIgul5;
    final OMSVGGElement partGreen;

    public ElementLoader(OMSVGSVGElement svg) {
        this.svg = svg;

        slide = (OMSVGGElement) getElement("slide");
        watchRight1 = (OMSVGGElement) getElement("watchRight1");
        watchRight2 = (OMSVGGElement) getElement("watchRight2");
        watchRight3 = (OMSVGGElement) getElement("watchRight3");
        watchRight4 = (OMSVGGElement) getElement("watchRight4");
        watchRight5 = (OMSVGGElement) getElement("watchRight5");
        igulSlide = (OMSVGGElement) getElement("igulSlide");
        orangeCube = (OMSVGRectElement) getElement("orangeCube");
        blueCube = (OMSVGRectElement) getElement("blueCube");
        blackCube = (OMSVGRectElement) getElement("blackCube");
        yellowMiddleCube = (OMSVGRectElement) getElement("yellowMiddleCube");
        pinkCube = (OMSVGRectElement) getElement("pinkCube");
        house = (OMSVGGElement) getElement("house");
        blueTriangle = (OMSVGGElement) getElement("blueTriangle");
        redLine = (OMSVGGElement) getElement("redLine");
        yellowLineDown = (OMSVGRectElement) getElement("yellowLineDown");
        greenLineDown = (OMSVGRectElement) getElement("greenLineDown");
        pinkButton = (OMSVGRectElement) getElement("pinkButton");
        redButton = (OMSVGRectElement) getElement("redButton");
        igulColor1 = (OMSVGGElement) getElement("igulColor1");
        igulColor2 = (OMSVGGElement) getElement("igulColor2");
        igulColor3 = (OMSVGGElement) getElement("igulColor3");
        igulColor4 = (OMSVGGElement) getElement("igulColor4");
        pinkLine = (OMSVGRectElement) getElement("pinkLine");
        squareColor = (OMSVGGElement) getElement("squareColor");
        cube2 = (OMSVGGElement) getElement("cube2");
        upTriIgul = (OMSVGGElement) getElement("upTriIgul");
        coolIgul1 = (OMSVGGElement) getElement("coolIgul1");
        coolIgul2 = (OMSVGGElement) getElement("coolIgul2");
        coolIgul3 = (OMSVGGElement) getElement("coolIgul3");
        coolIgul4 = (OMSVGGElement) getElement("coolIgul4");
        coolIgul5 = (OMSVGGElement) getElement("coolIgul5");
        partGreen = (OMSVGGElement) getElement("partGreen");
    }

    private OMSVGElement getElement(String elementId) {
        return Utils.getSVGElement(elementId, svg);
    }

    public OMSVGAnimationElement getAnimation(String elementId) {
        return Utils.getAnimationElement(elementId, svg);
    }
}
