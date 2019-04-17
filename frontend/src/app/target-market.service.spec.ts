import { TestBed } from '@angular/core/testing';

import { TargetMarketService } from './target-market.service';

describe('TargetMarketService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: TargetMarketService = TestBed.get(TargetMarketService);
    expect(service).toBeTruthy();
  });
});
