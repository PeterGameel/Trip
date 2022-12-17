import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeleteStationComponent } from './delete-station.component';

describe('DeleteStationComponent', () => {
  let component: DeleteStationComponent;
  let fixture: ComponentFixture<DeleteStationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DeleteStationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DeleteStationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
